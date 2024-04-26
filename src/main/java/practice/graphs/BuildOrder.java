package practice.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildOrder {

   public Project[] findBuildOrder(String[] projects, String[][] dependencies) {
      Graph graph = buildGraph(projects, dependencies);
      return buildOrder(graph.getNodes());
   }

   private Project[] buildOrder(List<Project> projects) {
      Project[] order = new Project[projects.size()];
      int endList = addNodDependentNodes(order, projects, 0);
      int toBeProcessed = 0;
      while (toBeProcessed < order.length) {
         Project current = order[toBeProcessed];
         if (current == null) {
            return null;
         }
         List<Project> children = current.getChildren();
         for (Project child : children) {
            child.decrementNoOfDependents();
         }
         endList = addNodDependentNodes(order, children, endList);
         toBeProcessed++;
      }
      return order;
   }

   private int addNodDependentNodes(Project[] order, List<Project> projects, int offset) {
      for (Project project : projects) {
         if (project.getNoOfDependents() == 0) {
            order[offset] = project;
            offset++;
         }
      }
      return offset;
   }

   private Graph buildGraph(String[] projects, String[][] dependencies) {
      Graph graph = new Graph();
      for (String project : projects) {
         graph.getOrCreateNode(project);
      }
      for (String[] dependency : dependencies) {
         String start = dependency[0];
         String end = dependency[1];
         graph.addEdge(start, end);
      }
      return graph;
   }

   public class Graph {

      private final List<Project> nodes = new ArrayList<>();
      private final Map<String, Project> map = new HashMap<>();

      public Project getOrCreateNode(String name) {
         if (!map.containsKey(name)) {
            Project node = new Project(name);
            nodes.add(node);
            map.put(node.getName(), node);
         }
         return map.get(name);
      }

      public void addEdge(String startName, String endName) {
         Project start = getOrCreateNode(startName);
         Project end = getOrCreateNode(endName);
         start.addNeighbor(end);
      }

      public List<Project> getNodes() {
         return this.nodes;
      }
   }

   public class Project {

      private final String name;
      private int noOfDependents = 0;
      private final List<Project> children = new ArrayList<>();
      private final Map<String, Project> map = new HashMap<>();

      public Project(String name) {
         this.name = name;
      }

      public void addNeighbor(Project node) {
         if (!map.containsKey(node.getName())) {
            children.add(node);
            map.put(node.getName(), node);
            node.incrementNoOfDependents();
         }
      }

      public void incrementNoOfDependents() {
         this.noOfDependents++;
      }

      public void decrementNoOfDependents() {
         this.noOfDependents--;
      }

      public int getNoOfDependents() {
         return this.noOfDependents;
      }

      public String getName() {
         return this.name;
      }

      public List<Project> getChildren() {
         return this.children;
      }
   }
}

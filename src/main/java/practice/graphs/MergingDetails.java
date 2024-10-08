package practice.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergingDetails {

   public List<List<String>> mergeDetails(List<List<String>> details) {
      Map<String, Integer> emailMap = new HashMap<>();
      DisjointSet ds = new DisjointSet(details.size());
      for (int i = 0; i < details.size(); i++) {
         for (int j = 1; j < details.get(i).size(); j++) {
            String emailId = details.get(i).get(j);
            if (emailMap.containsKey(emailId)) {
               ds.unionBySize(emailMap.get(emailId), i);
            } else {
               emailMap.put(emailId, i);
            }
         }
      }
      List<List<String>> mergedEmails = new ArrayList<>();
      for (int i = 0; i < details.size(); i++) {
         mergedEmails.add(new ArrayList<>());
      }
      emailMap.forEach((email, value) -> {
         int index = ds.findUltimateParent(value);
         List<String> addedEmails = mergedEmails.get(index);
         addedEmails.add(email);
         mergedEmails.add(addedEmails);
      });
      List<List<String>> output = new ArrayList<>();
      for (int i = 0; i < details.size(); i++) {
         if (mergedEmails.get(i).size() == 0) {
            continue;
         }
         Collections.sort(mergedEmails.get(i));
         List<String> ans = new ArrayList<>();
         ans.add(details.get(i).get(0));
         ans.addAll(mergedEmails.get(i));
         output.add(ans);
      }
      return output;
   }
}

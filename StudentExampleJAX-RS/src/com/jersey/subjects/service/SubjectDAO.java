package com.jersey.subjects.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jersey.subjects.pojo.Subject;


public class SubjectDAO {
	 
    private static final Map<String, Subject> subMap = new HashMap<String, Subject>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Subject sub1 = new Subject("S01", "Tamil", "India");
        Subject sub2 = new Subject("S02", "English", "Nepal");
        Subject sub3 = new Subject("S03", "Maths", "Pakistan");
 
        subMap.put(sub1.getSubjectID(), sub1);
        subMap.put(sub2.getSubjectID(), sub2);
        subMap.put(sub3.getSubjectID(), sub3);
    }
 
    public static Subject getSubject(String subNo) {
        return subMap.get(subNo);
    }
 
    public static Subject addSubject(Subject sub) {
        subMap.put(sub.getSubjectID(), sub);
        return sub;
    }
 
    public static Subject updateSubject(Subject sub) {
        subMap.put(sub.getSubjectID(), sub);
        return sub;
    }
 
    public static void deleteSubject(String subNo) {
        subMap.remove(subNo);
    }
 
    public static List<Subject> getAllSubjects() {
        Collection<Subject> c = subMap.values();
        List<Subject> list = new ArrayList<Subject>();
        list.addAll(c);
        return list;
    }
     
    List<Subject> list;
 
}
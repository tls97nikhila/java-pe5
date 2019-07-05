package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//class main test
public class MainTest {
                // sorts the student objects arrayList
        public List<Student> sorting(List<Student> students) {
            StudentSorter ss=new StudentSorter();
            Collections.sort(students,ss);
            return students;  //return sorted student list
        }
    }
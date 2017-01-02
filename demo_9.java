import java.util.*;
class shirt
{
int invcount;
String shirtdesc;
public shirt(int i,String d){
invcount=i;
shirtdesc=d;
}
}
class Idsort implements Comparator<shirt>{
public int compare(shirt p1,shirt p2){
if(p1.invcount==p2.invcount){return 0;}
else if(p1.invcount>p2.invcount){return 1;}
else {return -1;}
}
}
class namesort implements Comparator<shirt>{
public int compare(shirt a,shirt b){
return b.shirtdesc.compareTo(a.shirtdesc);
}
}
class demo_9
{
public static void main(String[] args)
{
shirt s1=new shirt(8,"Full sleeves");
shirt s2=new shirt(4,"Half sleeves");
shirt s3=new shirt(9,"Kurtha");
ArrayList a=new ArrayList();
a.add(s1);
a.add(s2);
a.add(s3);
Collections.sort(a,new Idsort());
System.out.println("Sorting by ID..");
Iterator i=a.iterator();
while(i.hasNext())
{
shirt p=(shirt)i.next();
System.out.println(p.invcount+ " "+p.shirtdesc);;}
Collections.sort(a,new namesort());
System.out.println("Sorting by Name..");
Iterator i1=a.iterator();
while(i1.hasNext()){
shirt p=(shirt)i1.next();
System.out.println(p.invcount+ " "+p.shirtdesc);;
}}
}
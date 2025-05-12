package Enthuware.Standart.test7;

public class test1 {
}
/**Given :
 * interface Process{
 *  public void process(int a, int b); }
 *  public class Data{
 *  int value;
 *  Data(int value){
 *  this.value = value;
 *  } }
 *  and the following code fragments:
 *  public void processList(ArrayList<Data> dataList, Process p){
 *  for(Data d: dataList){
 *  p.process(d.value, d.value);
 *  } }  ....
 *  ArrayList<Data> al = new ArrayList<Data>();
 *  al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
 *  //INSERT METHOD CALL HERE
 *  Which of the following options can be inserted above so that it will print 1 4 9?*/
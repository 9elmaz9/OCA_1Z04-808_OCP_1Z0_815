package Enthuware.Standart.test2;

public class test27 {
}
/**Consider the following method:
 *  static int mx(int s){
 *  for(int i=0; i<3; i++){
 *  s = s + i;
 *  }
 *  return s;
 *  }
 *  and the following code snippet:
 *  int s = 5;
 *  s += s + mx(s) + ++s;
 *  System.out.println(s);
 *  What will it print?*/

//24

/*s += (expression) will be converted to s =s + expression. So the given expression will become:
s = s + s + mx(s) + ++s;
 s = 5 + 5 + mx(5) + 6;
  s = 5 + 5+ 8 + 6;
   s = 24;*/

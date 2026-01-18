public class arraylistdsa {
  int arr[];
  int size;
  arraylistdsa(int capacity) {
      this.arr = new int[capacity];
      this.size = 0;
  }
  public void ensurecapacity(int capacity) {
      if(size==capacity) {
          int newcapacity = arr.length * 2;
          int newarr[] = new int[newcapacity];
          for(int i = 0; i < arr.length; i++) {
              newarr[i] = arr[i];
          }
          arr=newarr;
      }
  }
  public void append(int value) {
      ensurecapacity(size);
      arr[size]=value;
      size++;
  }
  public void insert(int value,int index) {
      if(index<0 || index>=size) {
          System.out.println("Index out of bounds");
          return;
      }
      ensurecapacity(size);
      for(int i=size;i>index;i--){
          arr[i]=arr[i-1];
      }
      arr[index]=value;
      size++;
  }
  public void delete(int index) {
      if(index<0 || index>=size) {
          System.out.println("Index out of bounds");
          return;
      }
      ensurecapacity(size);
      for (int i = index ; i < size-1 ; i++) {
          arr[i]=arr[i+1];
      }
      size--;
  }
  public void display() {
      for(int i = 0; i < size; i++) {
          System.out.print(arr[i]+" ");
      }
      System.out.println();
  }




    public static void main(String[] args) {
         arraylistdsa ob = new arraylistdsa(10);
         ob.append(10);
         ob.append(20);
         ob.append(30);
         ob.display();
         ob.insert(100,2);
         ob.display();
         ob.delete(2);
         ob.display();
    }
}

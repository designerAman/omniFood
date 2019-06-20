import java.util.*;

class TestClass {
    
    public static int  searchLeft( int end, int arr[]){
        boolean flag=false;
        for(int i=end-1;i>=0;i--){
            if(arr[i]==1){
                return i;
                flag=true;
            }
            if(i==0 && flag==false){
                return -1;
            }
            flag=false;
        }
    }
    public static int searchRight(int end, int arr[]){
        boolean flag=false;
        for(int i=end+1;i<arr.lenght();i++){
            if(arr[i]==1){
                return i;
                flag=true;
            }if(i==arr.length()-1 && flag==false){
                return -1;
            }
            flag=false;
        }
    }
    
    
    
    
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];
        int qrr[][]=new int[q][2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            for(int j=0;j<2;j++){
                qrr[i][j]=sc.nextInt();
            }
        }
        int count=q;
        while(q>0){
            for(int i=0;i<count;i++){
                if(qrr[i][0]==1){
                    arr[qrr[i][1]]=1;
                }else{
                    int index=qrr[i][1];
                    int resultLeft=searchLeft(index, arr);
                    int resultRight=searchRight(index, arr);
                    System.out.print(resultLeft+" "+resultRight);
                    System.out.println();
                }
            }
            q--;
        }
    }
}

package recursion;

public class Q13_DiceRoll {
    static void diceRoll(String p, int target){
        if(target==0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            diceRoll(p+i,target-i);
        }
    }

    static void diceRollFaces(String p, int target, int faces){
        if(target==0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1;i<=faces && i<=target;i++){
            diceRollFaces(p+i,target-i,faces);
        }
    }
    public static void main(String[] args) {
        int target=4;
        diceRoll("",target);
        System.out.println();
        diceRollFaces("",target,8);
    }
}

package Lista04;

public class Exercicio03 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{1, 1, 1, 1, 1};

        somaAcumulada(nums);
        somaAcumulada(nums2);
    }

    public static void somaAcumulada(int [] nums) {
        int somaAcumulada = 0;
        int somaAtual = 0;
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            somaAtual = somaAcumulada + nums[i];
            System.out.print(somaAtual);
            somaAcumulada = somaAtual;

            if (i < nums.length -1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        }

    }




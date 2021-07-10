import java.util.*;

public class Main {

    public static void main(String ...args) {

        Persoana ion = new Persoana("Ionescu", "Ion", "6000123");
        Persoana popescu = new Persoana("Popescu", "Ion", "698433");
        Persoana maria = new Persoana("Mihaiescu", "Maria", "1353256");
        Persoana ana = new Persoana("Ionescu", "Ana", "1341213");
        Persoana dan = new Persoana("Matei", "Dan", "2325123");
        Persoana ioana = new Persoana("Dinero", "Ioana", "54423742");
        Persoana mara = new Persoana("Anton", "Mara", "45672353");
        Persoana catalin = new Persoana("Anton", "Catalin", "4526347");

        Adresa str11 = new Adresa("Strada 11", 1);
        Adresa str12 = new Adresa("Strada 12", 2);

        ion.setAdresa(str12);
        ana.setAdresa(str12);
        popescu.setAdresa(new Adresa("Strada 10", 3));
        maria.setAdresa(str11);
        mara.setAdresa(str11);
        catalin.setAdresa(str11);
        dan.setAdresa(new Adresa("Strada 11", 6));
        ioana.setAdresa(new Adresa("Strada 5", 3));

        List<Persoana> persoane = new ArrayList<Persoana>();
        persoane.add(ion);
        persoane.add(popescu);
        persoane.add(maria);
        persoane.add(ana);
        persoane.add(mara);
        persoane.add(ioana);
        persoane.add(dan);
        persoane.add(catalin);

        ex1_2(persoane);
        ex3(persoane);
    }

    public static void ex1_2(List<Persoana> persoane) {
        System.out.println("====={ Punctul 1 }=====\n");

        Map<Adresa, Integer> map = new HashMap<Adresa, Integer>();
        int nr_adrese = 0;

        for (Persoana p : persoane) {
            if (!map.containsKey(p.getAdresa()))
                map.put(p.getAdresa(), 1);
            else map.put(p.getAdresa(), map.get(p.getAdresa()) + 1);
        }

        Map.Entry<Adresa, Integer> max = null;

        for (Map.Entry<Adresa, Integer> e : map.entrySet()) {
            if (max == null || e.getValue().compareTo(max.getValue()) > 0)
                max = e;

            if (e.getValue() > 1) nr_adrese++;
        }

        System.out.println("Adresa la care stau cele mai multe persoane: " + max.getKey().toString());

        System.out.println("\n====={ Punctul 2 }=====\n\n" +
                "Numarul adreselor la care stau mai mult de o persoana: " + nr_adrese);
    }

    public static void ex3(List<Persoana> persoane) {
        System.out.println("\n====={ Punctul 3 }=====\n");

        Scanner sc = new Scanner(System.in);
        String nume_dat = sc.nextLine();
        int nr_adrese = 0;

        for (Persoana p : persoane)
            if (p.getNume().equals(nume_dat)) nr_adrese++;

        System.out.println("Numarul adreselor la care stau persoanele cu numele \'" +
                nume_dat + "\' este: " + nr_adrese);
    }
}

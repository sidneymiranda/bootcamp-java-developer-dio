package testes;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Date;

public class ClassDate {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//        String stringOne = "03-03-1988 23:45:00";
//        String stringTwo = "15-05-2010 23:45:00";
//
//        Date niver = sdf.parse(stringOne);
//        Date data = sdf.parse(stringTwo);
//        System.out.println(niver.before(data));
//        System.out.println(niver.after(data));
//        System.out.println(niver.getTime());

//        Calendar hoje = Calendar.getInstance();
//        System.out.println("Hoje "+hoje.getTime());

//        hoje.add(Calendar.DATE, -10);
//        System.out.println("Passado "+hoje.getTime());

//        hoje.add(Calendar.MONTH, 5);
//        System.out.println("Daqui a 5 meses: "+ hoje.getTime());
//        hoje.add(Calendar.YEAR, 3);
//        System.out.println("Daqui a 3 anos: "+ hoje.getTime());

//        System.out.printf("%tc\n", hoje);
//        System.out.printf("americano - %tF\n", hoje);
//        System.out.printf("brasileiro - %tD\n", hoje);
//        System.out.printf("FORMATO 12H - %tr\n", hoje);
//        System.out.printf("FORMATO 24H - %tT\n", hoje);

//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        Scanner sc = new Scanner(System.in);
//        Date vencimento = sdf.parse(sc.nextLine());
//
//        Calendar data = new GregorianCalendar();
//        data.setTime(vencimento);
//
//        int amount = (data.get(Calendar.DAY_OF_WEEK) == 7) ? 2 : (data.get(Calendar.DAY_OF_WEEK) == 1) ? 1 : 0;
//        data.add(data.DATE, amount);
//
//        System.out.printf("%tc\n",data);
//        sc.close();
        LocalDateTime agora = LocalDateTime.now();
        Date d = new Date(2323L);
        System.out.println(d);
//        System.out.println(agora.plusYears(4).plusMonths(6).plusHours(12));
    }

}

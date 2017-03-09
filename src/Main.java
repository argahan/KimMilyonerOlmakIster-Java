import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Cevap;
		int deger,dongu=0,secim,jokersecim,aramajokersecim;
		boolean durum=true;
		Random randomNum=new Random();
		String AramaJoker1,AramaJoker2,AramaJoker3;
		int Para[]={0,500,1000,2500,5000,7500,15000,25000,50000,10000,250000,500000,1000000};
		String Joker[]={"Seyirciye Sorma","0","Arama","0","Yar� Yar�ya","0","�ift Cevap","0"};
		String Soru[][]=Sorular.Soru();
		
			
			System.out.println("Arama Jokeri i�in 3 isim giriniz: ");
			AramaJoker1=input.nextLine();
			AramaJoker2=input.nextLine();
			AramaJoker3=input.nextLine();

			System.out.println("L�tfen Cevaplar� b�y�k harfle yaz�n�z.");
			
			while(durum){
				
				deger=randomNum.nextInt(Soru.length);
				
				Sor.Sor(Soru, deger);
				
				System.out.print("Cevap i�in 1\nJoker i�in 2\n�ekilmek i�in 3\nSe�iminiz: ");
				secim=input.nextInt();
				
				if(secim==1)
				{
					
					System.out.print("Cevab�n�z: ");
					Cevap=input.next();
					
					if(Cevap.equals(Soru[deger][5])){
						System.out.println("dogru cevap verdiniz.Tebrikler.");
						dongu++;
				}
				else{
					System.out.println("yanl�� cevap verdiniz.");
					
					if(dongu>=0 && dongu<=2)
						dongu=0;
					else if(dongu>=3 && dongu<=6)
						dongu=2;
					else 
						dongu=6;
						
					durum=false;
					}
				}
				else if(secim==2){
					Secim.jokerYazdir(dongu, Joker);
					
					System.out.print("Hangi jokeri kullanmak istiyorsunuz:");
					jokersecim=input.nextInt();
					
					if(jokersecim==1 && Joker[1]=="0"){
						Joker[1]="1";
						
						Secim.SeyirciYazdir(Soru, deger);
						
						System.out.print("Cevab�n�z: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							System.out.println("yanl�� cevap verdiniz.");
							
							if(dongu>=0 && dongu<=2)
								dongu=0;
							else if(dongu>=3 && dongu<=6)
								dongu=2;
							else 
								dongu=6;
							
							durum=false;
						}
					}
					else if(jokersecim==2 && Joker[3]=="0"){
						Joker[3]="1";
						
						Secim.AramaYazdir(Soru, deger, AramaJoker1, AramaJoker2, AramaJoker3);
						
						System.out.print("Cevab�n�z: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							System.out.println("yanl�� cevap verdiniz.");
							if(dongu>=0 && dongu<=2)
								dongu=0;
							else if(dongu>=3 && dongu<=6)
								dongu=2;
							else 
								dongu=6;
							
							durum=false;
						}
						
					}
					else if(jokersecim==3 && Joker[5]=="0"){
						Joker[5]="1";
						
						Secim.YariYariyaYazdir(Soru, deger);
						
						System.out.print("Cevab�n�z: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							System.out.println("yanl�� cevap verdiniz.");
							if(dongu>=0 && dongu<=2)
								dongu=0;
							else if(dongu>=3 && dongu<=6)
								dongu=2;
							else 
								dongu=6;
							
							durum=false;
						}
							
					}
					else if(jokersecim==4 && Joker[7]=="0"){
						System.out.print("Cevab�n�z: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							if(Cevap.equals("A")){
								
								Secim.xCevapYazdir(Cevap, Soru, deger);
								
								System.out.print("Cevab�n�z: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanl�� cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else if(Cevap.equals("B")){
								Secim.xCevapYazdir(Cevap, Soru, deger);

								System.out.print("Cevab�n�z: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanl�� cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else if(Cevap.equals("C")){
								Secim.xCevapYazdir(Cevap, Soru, deger);

								System.out.print("Cevab�n�z: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanl�� cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else if(Cevap.equals("D")){
								Secim.xCevapYazdir(Cevap, Soru, deger);

								System.out.print("Cevab�n�z: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanl�� cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else{
								System.out.println("hatal� tu�lama yapt�n�z.");
								dongu=0;
								durum=false;
							}	
						}
					}
					
					else{
						System.out.println("hatal� tu�lama yapt�n�z.");
						dongu=0;
						durum=false;
					}
				}						
				
				else if(secim==3){
					durum=false;
				}
				else {
					System.out.println("hatal� tu�lama yapt�n�z.");
					dongu=0;
					durum=false;
				}
			
				ParaYazdir.ParaYazdir(Para, durum, dongu);		
	}
			System.out.println("kazand���n�z para �d�l�: "+Para[dongu]);
	

}}

package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//byte
		byte datoByte = 2;

// wrapper
		Byte datoByteWrapper = 3;
		System.out.println("primitivo" + datoByte);
		System.out.println("wrapper" + datoByteWrapper);
		
		//Converciones
		byte datoByte1 = 6;
		Byte datoConvertido=datoByte1 ;
		System.out.println("byte comvertido" + datoConvertido);
		
		//converciones2
		Byte datoConvertido2=6;
		byte datoByte2=datoConvertido2.byteValue();
		System.out.println("byte comvertido" + datoByte2);
// short
		short datoShort = 1;
		Short datoShortWrapper = 3;
		System.out.println("primitivo" + datoShort);
		System.out.println("wrapper" + datoShortWrapper);
		//convertido
		short datoShort1 = 4;
		Short shortConvertido= datoShort1;
		System.out.println("short  comvertido" + shortConvertido);
		//convertido2
		Short shortConvertido2=3; 
		int datoShort2=shortConvertido.shortValue();
		System.out.println("short  comvertido" + datoShort2);
//int

		int edad = 45;
		Integer edadWrapper = 48;
		System.out.println("primitivo" + edad);
		System.out.println("wrapper" + edadWrapper);
		//converciones
		
		
		int edad1=46;
		Integer Integerconvertido=edad1;
		System.out.println("Integer  comvertido" + Integerconvertido);
		//converciones2
		Integer IntegerConvertido2=6;
		int edad2=IntegerConvertido2.intValue();
		System.out.println("byte comvertido" +edad2);
//long
		long valorGrande = 125988;

		Long valorGrandeWrapper = 123213L;
		System.out.println("primitivo" + valorGrande);
		System.out.println("wrapper" + valorGrandeWrapper);
		//converciones
		long valorGrande1=234;
		Long longconvertido=valorGrande1;
		System.out.println("long comvertido" + longconvertido);
		//converciones2
		Long longconvertido2=876L;
		long valorGrande2=longconvertido2;
		System.out.println("long comvertido" + valorGrande2);
		
//boolean

		boolean valorBoolean = true;

		Boolean valorBooleanWrapper = true;
		System.out.println("primitivo" + valorBoolean);
		System.out.println("wrapper" + valorBooleanWrapper);
		//converciones
				boolean valorBoolean1 =true;
				Boolean booleanconvertido=valorBoolean1;
				System.out.println("long comvertido" + booleanconvertido);
				//converciones2
				Boolean valorBoolean2=true;
				boolean valorBoolean3=valorBoolean2.booleanValue()
				System.out.println("long comvertido" + valorBoolean3);
		
		// float

		float valorFloat = 0.2f;

		Float valorFloatWrapper = 0.2f;
		System.out.println("primitivo" + valorFloat);
		System.out.println("wrapper" + valorFloatWrapper);
		//converciones
				float valorFloat1=2.2f;
				Float floatconvertido=valorFloat1;
				System.out.println("long comvertido" + longconvertido);
				//converciones2
				Float floatconvertido2=8.4f;
				long valorFloat2=floatconvertido2.shortValue();
				System.out.println("long comvertido" + valorFloat);
		// double

		double valorDouble = 0.34;

		Double valorDoubleWrapper = 0.23;
		System.out.println("primitivo" + valorDouble);
		System.out.println("wrapper" + valorDoubleWrapper);
		//converciones
				long valorGrande3=234;
				Long longconvertid5=valorGrande1;
				System.out.println("long comvertido" + longconvertido);
				//converciones2
				Long longconvertido7=876L;
				long valorGrande8=longconvertido2;
				System.out.println("long comvertido" + valorGrande2);

		// char

		char valorChar = 'a';

		Character valorCharacterWrapper = 'a';
		System.out.println("primitivo" + valorChar);
		System.out.println("wrapper" + valorCharacterWrapper);
		
		//Converciones
				char valorChar1 = 'a';
				Character cahrConvertido=valorChar1 ;
				System.out.println("byte comvertido" + cahrConvertido);
				
				//converciones2
				Character cahrConvertido2='b';
				char valorChar2=cahrConvertido2.charValue()
				System.out.println("byte comvertido"+valorChar2);

	}

}

public class Class23 {

	static Js5IndexImpl staticJs5IndexImpl2;
	String aString7;
	String aString6;
	public final int anInt66;
	public final long aLong14;
	public final ExchangeOffer aClass61_1;

	public String method89() {
		return aString7;
	}

	public String method90() {
		return aString6;
	}

	Class23(ByteBuf var1, byte var2, int var3) {
		aString7 = var1.readString();
		aString6 = var1.readString();
		anInt66 = var1.readUShort();
		aLong14 = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		aClass61_1 = new ExchangeOffer();
		aClass61_1.method287(2);
		aClass61_1.method288(var2);
		aClass61_1.price = var4;
		aClass61_1.itemQuantity = var5;
		aClass61_1.transferred = 0;
		aClass61_1.spent = 0;
		aClass61_1.itemId = var3;
	}

}

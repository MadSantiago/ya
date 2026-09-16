package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۦؒؖۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3130 {
    f10534("ADD"),
    f10488("AND"),
    f10489("APPLY"),
    f10486("ASSIGN"),
    f10491("BITWISE_AND"),
    f10526("BITWISE_LEFT_SHIFT"),
    f10532("BITWISE_NOT"),
    f10499("BITWISE_OR"),
    f10524("BITWISE_RIGHT_SHIFT"),
    f10494("BITWISE_UNSIGNED_RIGHT_SHIFT"),
    f10480("BITWISE_XOR"),
    f10477("BLOCK"),
    f10510("BREAK"),
    f10483("CASE"),
    f10527("CONST"),
    f10490("CONTINUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("CONTROL"),
    f10501("CREATE_ARRAY"),
    f10519("CREATE_OBJECT"),
    f10517("DEFAULT"),
    f10509("DEFINE_FUNCTION"),
    f10518("DIVIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("DO"),
    f10521("EQUALS"),
    f10525("EXPRESSION_LIST"),
    f10478("FN"),
    f10533("FOR_IN"),
    f10537("FOR_IN_CONST"),
    f10493("FOR_IN_LET"),
    f10496("FOR_LET"),
    f10507("FOR_OF"),
    f10514("FOR_OF_CONST"),
    f10497("FOR_OF_LET"),
    f10503("GET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("GET_CONTAINER_VARIABLE"),
    f10482("GET_INDEX"),
    f10481("GET_PROPERTY"),
    f10505("GREATER_THAN"),
    f10540("GREATER_THAN_EQUALS"),
    f10508("IDENTITY_EQUALS"),
    f10511("IDENTITY_NOT_EQUALS"),
    f10535("IF"),
    f10487("LESS_THAN"),
    f10500("LESS_THAN_EQUALS"),
    f10516("MODULUS"),
    f10506("MULTIPLY"),
    f10512("NEGATE"),
    f10528("NOT"),
    f10529("NOT_EQUALS"),
    f10498("NULL"),
    f10530("OR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("PLUS_EQUALS"),
    f10479("POST_DECREMENT"),
    f10515("POST_INCREMENT"),
    f10485("QUOTE"),
    f10495("PRE_DECREMENT"),
    f10538("PRE_INCREMENT"),
    f10520("RETURN"),
    f10536("SET_PROPERTY"),
    f10484("SUBTRACT"),
    f10502("SWITCH"),
    f10492("TERNARY"),
    f10523("TYPEOF"),
    f10539("UNDEFINED"),
    f10513("VAR"),
    f10504("WHILE");


    /* JADX INFO: renamed from: ۦۖ */
    public static final HashMap f10531 = new HashMap();

    /* JADX INFO: renamed from: ۦۨ */
    public final int f10541;

    static {
        for (EnumC3130 enumC3130 : values()) {
            f10531.put(Integer.valueOf(enumC3130.f10541), enumC3130);
        }
    }

    EnumC3130(String str) {
        this.f10541 = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f10541).toString();
    }
}

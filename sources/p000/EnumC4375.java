package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۦُٗؖؓ[], still in use, count: 1, list:
  (r0v1 ۦُٗؖؓ[]) from 0x007c: CONSTRUCTOR (r0v1 ۦُٗؖؓ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:125) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ۦُٗؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4375 {
    /* JADX INFO: Fake field, exist only in values array */
    EF36(1, new C4441(new long[]{-6986015286192701598L, 6201386464717288474L}).toString(), new C4441(new long[]{1030306527274384271L, -1203379856401209605L}).toString()),
    /* JADX INFO: Fake field, exist only in values array */
    EF74(2, new C4441(new long[]{6541639047209094841L, -7028647656525709242L}).toString(), new C4441(new long[]{-2236411696403645468L, 2512453584059246429L}).toString()),
    /* JADX INFO: Fake field, exist only in values array */
    EF113(-1, new C4441(new long[]{-6481858672916210119L, -7100509223852654035L, 6431254919226378022L}).toString(), new C4441(new long[]{-5317943953824570340L, 7533629258465818008L, 4172211577412118555L}).toString());


    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4681 f14415;

    /* JADX INFO: renamed from: ۥْ */
    public final int f14417;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f14418;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f14419;

    static {
        f14415 = new C4681(enumC4375Arr);
    }

    public EnumC4375(int i, String str, String str2) {
        super(str, i);
        this.f14419 = str2;
        this.f14418 = i;
        this.f14417 = i;
    }

    public static EnumC4375 valueOf(String str) {
        return (EnumC4375) Enum.valueOf(EnumC4375.class, str);
    }

    public static EnumC4375[] values() {
        return (EnumC4375[]) f14416.clone();
    }
}

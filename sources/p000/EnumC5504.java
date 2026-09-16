package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۦۡٛۖ[], still in use, count: 1, list:
  (r0v1 ۦۡٛۖ[]) from 0x0038: CONSTRUCTOR (r0v1 ۦۡٛۖ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۦۡٛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5504 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C4681 f18173;

    /* JADX INFO: renamed from: ۦ۟ */
    public final char f18174;

    /* JADX INFO: renamed from: ۦۨ */
    public final char f18175;

    static {
        f18173 = new C4681(enumC5504Arr);
    }

    public EnumC5504(char c, char c2) {
        super(str, i);
        this.f18175 = c;
        this.f18174 = c2;
    }

    public static EnumC5504 valueOf(String str) {
        return (EnumC5504) Enum.valueOf(EnumC5504.class, str);
    }

    public static EnumC5504[] values() {
        return (EnumC5504[]) f18172.clone();
    }
}

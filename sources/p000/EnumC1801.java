package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۥٜؑؖؒ[], still in use, count: 1, list:
  (r0v1 ۥٜؑؖؒ[]) from 0x0082: CONSTRUCTOR (r0v1 ۥٜؑؖؒ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:131) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۥٜؑؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1801 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("PUBLIC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("PRIVATE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("PROTECTED"),
    f6000("STATIC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF44("FINAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF54("SYNCHRONIZED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF65("VOLATILE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF76("TRANSIENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF86("NATIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF97("INTERFACE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF108("ABSTRACT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF119("STRICT");


    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C4681 f5999;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f6001;

    static {
        f5999 = new C4681(enumC1801Arr);
    }

    public EnumC1801(String str) {
        super(str, i);
        this.f6001 = i;
    }

    public static EnumC1801 valueOf(String str) {
        return (EnumC1801) Enum.valueOf(EnumC1801.class, str);
    }

    public static EnumC1801[] values() {
        return (EnumC1801[]) f5998.clone();
    }
}

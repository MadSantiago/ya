package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۥۧؑۖۦ[], still in use, count: 1, list:
  (r0v1 ۥۧؑۖۦ[]) from 0x00a4: CONSTRUCTOR (r0v1 ۥۧؑۖۦ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:165) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۥۧؑۖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2847 {
    f9505(R.string.tab_navi, new C4441(new long[]{-8123634251976451036L, 636411964061005666L}).toString()),
    f9506(R.string.tab_refuel, new C4441(new long[]{7356693112010908102L, 2123634177173325403L}).toString()),
    f9504(R.string.tab_taxi, new C4441(new long[]{-7726591125926762161L, -8970291421320126011L}).toString()),
    f9507(R.string.tab_transport, new C4441(new long[]{4063203467673620908L, -3167224921772709063L}).toString());


    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C4681 f9509;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f9510;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f9511;

    static {
        f9509 = new C4681(enumC2847Arr);
    }

    public EnumC2847(int i, String str) {
        super(str, i);
        this.f9511 = str;
        this.f9510 = i;
    }

    public static EnumC2847 valueOf(String str) {
        return (EnumC2847) Enum.valueOf(EnumC2847.class, str);
    }

    public static EnumC2847[] values() {
        return (EnumC2847[]) f9508.clone();
    }
}

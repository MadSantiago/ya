package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۦٍؙؒؖ[], still in use, count: 1, list:
  (r0v1 ۦٍؙؒؖ[]) from 0x00a4: CONSTRUCTOR (r0v1 ۦٍؙؒؖ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:165) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۦٍؙؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3528 {
    f11695(R.string.organization_stories, new C4441(new long[]{-5259922584757975329L, 6245334247982575927L}).toString()),
    f11696(R.string.organization_offers, new C4441(new long[]{-3359873822424988011L, 7159938266304937491L}).toString()),
    f11694(R.string.organization_goods, new C4441(new long[]{4479905685507281793L, 8801575206933300548L}).toString()),
    f11697(R.string.organization_collections, new C4441(new long[]{7570013607285339733L, -7999978348033338070L, -8487377070575418048L}).toString());


    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C4681 f11699;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f11700;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f11701;

    static {
        f11699 = new C4681(enumC3528Arr);
    }

    public EnumC3528(int i, String str) {
        super(str, i);
        this.f11701 = str;
        this.f11700 = i;
    }

    public static EnumC3528 valueOf(String str) {
        return (EnumC3528) Enum.valueOf(EnumC3528.class, str);
    }

    public static EnumC3528[] values() {
        return (EnumC3528[]) f11698.clone();
    }
}

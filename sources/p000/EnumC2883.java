package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۥۧؖٝۦ[], still in use, count: 1, list:
  (r0v1 ۥۧؖٝۦ[]) from 0x0077: CONSTRUCTOR (r0v1 ۥۧؖٝۦ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:120) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۥۧؖٝۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2883 {
    /* JADX INFO: Fake field, exist only in values array */
    EF35(R.string.settings_env_type1, new C4441(new long[]{2653018653380122572L, 8624337545997696273L}).toString()),
    /* JADX INFO: Fake field, exist only in values array */
    EF72(R.string.settings_env_type2, new C4441(new long[]{833516726696382972L, 1586803339297090296L}).toString()),
    /* JADX INFO: Fake field, exist only in values array */
    EF108(R.string.settings_env_type3, new C4441(new long[]{7746627313906517238L, 5386853565966038606L}).toString());


    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C4681 f9616;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f9617;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f9618;

    static {
        f9616 = new C4681(enumC2883Arr);
    }

    public EnumC2883(int i, String str) {
        super(str, i);
        this.f9618 = str;
        this.f9617 = i;
    }

    public static EnumC2883 valueOf(String str) {
        return (EnumC2883) Enum.valueOf(EnumC2883.class, str);
    }

    public static EnumC2883[] values() {
        return (EnumC2883[]) f9615.clone();
    }
}

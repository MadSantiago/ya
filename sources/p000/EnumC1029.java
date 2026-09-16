package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۥُُؑٓ[], still in use, count: 1, list:
  (r0v1 ۥُُؑٓ[]) from 0x0057: CONSTRUCTOR (r0v1 ۥُُؑٓ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:88) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۥُُؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1029 {
    f3634(R.string.dialog_reset_settings, new C4441(new long[]{-6803907604473909179L, -2524093988522904749L}).toString()),
    f3635(R.string.dialog_reset_dexkit, new C4441(new long[]{1955418794484325610L, -9088049442844537353L}).toString());


    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C4681 f3636;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f3637;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f3638;

    static {
        f3636 = new C4681(enumC1029Arr);
    }

    public EnumC1029(int i, String str) {
        super(str, i);
        this.f3638 = str;
        this.f3637 = i;
    }

    public static EnumC1029 valueOf(String str) {
        return (EnumC1029) Enum.valueOf(EnumC1029.class, str);
    }

    public static EnumC1029[] values() {
        return (EnumC1029[]) f3633.clone();
    }
}

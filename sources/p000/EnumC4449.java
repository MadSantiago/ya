package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۦ٘ؖ۟ؔ[], still in use, count: 1, list:
  (r0v1 ۦ٘ؖ۟ؔ[]) from 0x00a1: CONSTRUCTOR (r0v1 ۦ٘ؖ۟ؔ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:162) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۦ٘ؖ۟ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4449 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(R.string.search_history_above, new C4441(new long[]{8465515522211329019L, -8402274565436987756L, 6187641289982186456L, 2161779668864258773L}).toString()),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(R.string.search_history_below, new C4441(new long[]{-7610247488641970034L, -2313169718707524265L, 8729626328316899025L, -6848613126609463272L}).toString()),
    f14663(R.string.search_history_full, new C4441(new long[]{-7101182184903696953L, -8018904265215891294L, 1848789136022285247L, -5072072572240634970L}).toString()),
    f14664(R.string.search_history_disabled, new C4441(new long[]{4567691346814013678L, -5378095499597864840L}).toString());


    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C4681 f14665;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f14666;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f14667;

    static {
        f14665 = new C4681(enumC4449Arr);
    }

    public EnumC4449(int i, String str) {
        super(str, i);
        this.f14667 = str;
        this.f14666 = i;
    }

    public static EnumC4449 valueOf(String str) {
        return (EnumC4449) Enum.valueOf(EnumC4449.class, str);
    }

    public static EnumC4449[] values() {
        return (EnumC4449[]) f14662.clone();
    }
}

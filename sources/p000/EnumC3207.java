package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۦؔؑؔۧ[], still in use, count: 1, list:
  (r0v1 ۦؔؑؔۧ[]) from 0x007a: CONSTRUCTOR (r0v1 ۦؔؑؔۧ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:123) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۦؔؑؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3207 {
    /* JADX INFO: Fake field, exist only in values array */
    EF26(R.string.services_plus_title, R.string.services_plus_summary, AbstractC2539.f8447),
    /* JADX INFO: Fake field, exist only in values array */
    EF54(R.string.services_eats_title, R.string.services_eats_summary, AbstractC2539.f8455),
    /* JADX INFO: Fake field, exist only in values array */
    EF82(R.string.services_taxi_title, R.string.services_taxi_summary, AbstractC2539.f8446),
    /* JADX INFO: Fake field, exist only in values array */
    EF111(R.string.services_refuel_title, R.string.services_refuel_summary, AbstractC2539.f8438);


    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4681 f10755;

    /* JADX INFO: renamed from: ۥْ */
    public final C1542 f10757;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f10758;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f10759;

    static {
        f10755 = new C4681(enumC3207Arr);
    }

    public EnumC3207(int i, int i2, C1542 c1542) {
        super(str, i);
        this.f10759 = i;
        this.f10758 = i2;
        this.f10757 = c1542;
    }

    public static EnumC3207 valueOf(String str) {
        return (EnumC3207) Enum.valueOf(EnumC3207.class, str);
    }

    public static EnumC3207[] values() {
        return (EnumC3207[]) f10756.clone();
    }
}

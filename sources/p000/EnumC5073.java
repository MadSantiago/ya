package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ۦۘٝ۠[], still in use, count: 1, list:
  (r0v1 ۦۘٝ۠[]) from 0x00b6: CONSTRUCTOR (r0v1 ۦۘٝ۠[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:183) call: ۦِٜؓۖ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ۦۘٝ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5073 {
    /* JADX INFO: Fake field, exist only in values array */
    EF26(R.string.car_routes_title, R.string.car_routes_summary, AbstractC2539.f8458),
    /* JADX INFO: Fake field, exist only in values array */
    EF55(R.string.main_search_title, R.string.main_search_summary, AbstractC2539.f8463),
    /* JADX INFO: Fake field, exist only in values array */
    EF84(R.string.main_rubrics_title, R.string.main_rubrics_summary, AbstractC2539.f8460),
    /* JADX INFO: Fake field, exist only in values array */
    EF113(R.string.main_profile_title, R.string.main_profile_summary, AbstractC2539.f8440),
    /* JADX INFO: Fake field, exist only in values array */
    EF142(R.string.main_weather_title, R.string.main_weather_summary, AbstractC2539.f8445),
    /* JADX INFO: Fake field, exist only in values array */
    EF171(R.string.main_transport_title, R.string.main_transport_summary, AbstractC2539.f8456);


    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4681 f16826;

    /* JADX INFO: renamed from: ۥْ */
    public final C1542 f16828;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f16829;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f16830;

    static {
        f16826 = new C4681(enumC5073Arr);
    }

    public EnumC5073(int i, int i2, C1542 c1542) {
        super(str, i);
        this.f16830 = i;
        this.f16829 = i2;
        this.f16828 = c1542;
    }

    public static EnumC5073 valueOf(String str) {
        return (EnumC5073) Enum.valueOf(EnumC5073.class, str);
    }

    public static EnumC5073[] values() {
        return (EnumC5073[]) f16827.clone();
    }
}

package p000;

/* JADX INFO: renamed from: ۥؖٗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0569 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0665 f2043 = AbstractC0993.m2148(C2258.f7505, "kotlinx.serialization.json.JsonUnquotedLiteral");

    /* JADX INFO: renamed from: ۥۣ */
    public static final AbstractC1020 m1270(AbstractC0695 abstractC0695) {
        AbstractC1020 abstractC1020 = abstractC0695 instanceof AbstractC1020 ? (AbstractC1020) abstractC0695 : null;
        if (abstractC1020 != null) {
            return abstractC1020;
        }
        throw new IllegalArgumentException("Element " + AbstractC5041.m8557(abstractC0695.getClass()) + " is not a JsonPrimitive");
    }
}

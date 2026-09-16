package p000;

/* JADX INFO: renamed from: ۦؚؖ٘ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3613 implements InterfaceC3120 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("IAB_TCF_PURPOSE_UNKNOWN"),
    f12042("IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE"),
    f12035("IAB_TCF_PURPOSE_SELECT_BASIC_ADS"),
    f12036("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE"),
    f12034("IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT"),
    f12037("IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE"),
    f12040("IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS"),
    f12041("IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT"),
    f12038("UNRECOGNIZED");


    /* JADX INFO: renamed from: ۦۨ */
    public final int f12043;

    EnumC3613(String str) {
        this.f12043 = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12043);
    }

    @Override // p000.InterfaceC3120
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1880() {
        if (this != f12038) {
            return this.f12043;
        }
        C1078.m2272("Can't get the number of an unknown enum value.");
        return 0;
    }
}

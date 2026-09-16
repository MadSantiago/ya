package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦؘؒۥٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3476 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC3476[] f11552;

    /* JADX INFO: renamed from: ۦۨ */
    public static final SparseArray f11553;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3476 EF1;

    static {
        EnumC3476 enumC3476 = new EnumC3476("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC3476 enumC3477 = new EnumC3476("GPRS", 1);
        EnumC3476 enumC3478 = new EnumC3476("EDGE", 2);
        EnumC3476 enumC3479 = new EnumC3476("UMTS", 3);
        EnumC3476 enumC34710 = new EnumC3476("CDMA", 4);
        EnumC3476 enumC34711 = new EnumC3476("EVDO_0", 5);
        EnumC3476 enumC34712 = new EnumC3476("EVDO_A", 6);
        EnumC3476 enumC34713 = new EnumC3476("RTT", 7);
        EnumC3476 enumC34714 = new EnumC3476("HSDPA", 8);
        EnumC3476 enumC34715 = new EnumC3476("HSUPA", 9);
        EnumC3476 enumC34716 = new EnumC3476("HSPA", 10);
        EnumC3476 enumC34717 = new EnumC3476("IDEN", 11);
        EnumC3476 enumC34718 = new EnumC3476("EVDO_B", 12);
        EnumC3476 enumC34719 = new EnumC3476("LTE", 13);
        EnumC3476 enumC34720 = new EnumC3476("EHRPD", 14);
        EnumC3476 enumC34721 = new EnumC3476("HSPAP", 15);
        EnumC3476 enumC34722 = new EnumC3476("GSM", 16);
        EnumC3476 enumC34723 = new EnumC3476("TD_SCDMA", 17);
        EnumC3476 enumC34724 = new EnumC3476("IWLAN", 18);
        EnumC3476 enumC34725 = new EnumC3476("LTE_CA", 19);
        f11552 = new EnumC3476[]{enumC3476, enumC3477, enumC3478, enumC3479, enumC34710, enumC34711, enumC34712, enumC34713, enumC34714, enumC34715, enumC34716, enumC34717, enumC34718, enumC34719, enumC34720, enumC34721, enumC34722, enumC34723, enumC34724, enumC34725, new EnumC3476("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f11553 = sparseArray;
        sparseArray.put(0, enumC3476);
        sparseArray.put(1, enumC3477);
        sparseArray.put(2, enumC3478);
        sparseArray.put(3, enumC3479);
        sparseArray.put(4, enumC34710);
        sparseArray.put(5, enumC34711);
        sparseArray.put(6, enumC34712);
        sparseArray.put(7, enumC34713);
        sparseArray.put(8, enumC34714);
        sparseArray.put(9, enumC34715);
        sparseArray.put(10, enumC34716);
        sparseArray.put(11, enumC34717);
        sparseArray.put(12, enumC34718);
        sparseArray.put(13, enumC34719);
        sparseArray.put(14, enumC34720);
        sparseArray.put(15, enumC34721);
        sparseArray.put(16, enumC34722);
        sparseArray.put(17, enumC34723);
        sparseArray.put(18, enumC34724);
        sparseArray.put(19, enumC34725);
    }

    public static EnumC3476 valueOf(String str) {
        return (EnumC3476) Enum.valueOf(EnumC3476.class, str);
    }

    public static EnumC3476[] values() {
        return (EnumC3476[]) f11552.clone();
    }
}

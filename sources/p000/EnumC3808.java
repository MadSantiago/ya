package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٍؘؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3808 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC3808[] f12637;

    /* JADX INFO: renamed from: ۦۨ */
    public static final SparseArray f12638;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3808 EF1;

    static {
        EnumC3808 enumC3808 = new EnumC3808("MOBILE", 0);
        EnumC3808 enumC3809 = new EnumC3808("WIFI", 1);
        EnumC3808 enumC38010 = new EnumC3808("MOBILE_MMS", 2);
        EnumC3808 enumC38011 = new EnumC3808("MOBILE_SUPL", 3);
        EnumC3808 enumC38012 = new EnumC3808("MOBILE_DUN", 4);
        EnumC3808 enumC38013 = new EnumC3808("MOBILE_HIPRI", 5);
        EnumC3808 enumC38014 = new EnumC3808("WIMAX", 6);
        EnumC3808 enumC38015 = new EnumC3808("BLUETOOTH", 7);
        EnumC3808 enumC38016 = new EnumC3808("DUMMY", 8);
        EnumC3808 enumC38017 = new EnumC3808("ETHERNET", 9);
        EnumC3808 enumC38018 = new EnumC3808("MOBILE_FOTA", 10);
        EnumC3808 enumC38019 = new EnumC3808("MOBILE_IMS", 11);
        EnumC3808 enumC38020 = new EnumC3808("MOBILE_CBS", 12);
        EnumC3808 enumC38021 = new EnumC3808("WIFI_P2P", 13);
        EnumC3808 enumC38022 = new EnumC3808("MOBILE_IA", 14);
        EnumC3808 enumC38023 = new EnumC3808("MOBILE_EMERGENCY", 15);
        EnumC3808 enumC38024 = new EnumC3808("PROXY", 16);
        EnumC3808 enumC38025 = new EnumC3808("VPN", 17);
        EnumC3808 enumC38026 = new EnumC3808("NONE", 18);
        f12637 = new EnumC3808[]{enumC3808, enumC3809, enumC38010, enumC38011, enumC38012, enumC38013, enumC38014, enumC38015, enumC38016, enumC38017, enumC38018, enumC38019, enumC38020, enumC38021, enumC38022, enumC38023, enumC38024, enumC38025, enumC38026};
        SparseArray sparseArray = new SparseArray();
        f12638 = sparseArray;
        sparseArray.put(0, enumC3808);
        sparseArray.put(1, enumC3809);
        sparseArray.put(2, enumC38010);
        sparseArray.put(3, enumC38011);
        sparseArray.put(4, enumC38012);
        sparseArray.put(5, enumC38013);
        sparseArray.put(6, enumC38014);
        sparseArray.put(7, enumC38015);
        sparseArray.put(8, enumC38016);
        sparseArray.put(9, enumC38017);
        sparseArray.put(10, enumC38018);
        sparseArray.put(11, enumC38019);
        sparseArray.put(12, enumC38020);
        sparseArray.put(13, enumC38021);
        sparseArray.put(14, enumC38022);
        sparseArray.put(15, enumC38023);
        sparseArray.put(16, enumC38024);
        sparseArray.put(17, enumC38025);
        sparseArray.put(-1, enumC38026);
    }

    public static EnumC3808 valueOf(String str) {
        return (EnumC3808) Enum.valueOf(EnumC3808.class, str);
    }

    public static EnumC3808[] values() {
        return (EnumC3808[]) f12637.clone();
    }
}

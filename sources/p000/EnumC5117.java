package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦۙؕٚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5117 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC5117[] f16965;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC5117 f16966;

    static {
        EnumC5117 enumC5117 = new EnumC5117("DEFAULT", 0);
        f16966 = enumC5117;
        EnumC5117 enumC5118 = new EnumC5117("UNMETERED_ONLY", 1);
        EnumC5117 enumC5119 = new EnumC5117("UNMETERED_OR_DAILY", 2);
        EnumC5117 enumC51110 = new EnumC5117("FAST_IF_RADIO_AWAKE", 3);
        EnumC5117 enumC51111 = new EnumC5117("NEVER", 4);
        EnumC5117 enumC51112 = new EnumC5117("UNRECOGNIZED", 5);
        f16965 = new EnumC5117[]{enumC5117, enumC5118, enumC5119, enumC51110, enumC51111, enumC51112};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC5117);
        sparseArray.put(1, enumC5118);
        sparseArray.put(2, enumC5119);
        sparseArray.put(3, enumC51110);
        sparseArray.put(4, enumC51111);
        sparseArray.put(-1, enumC51112);
    }

    public static EnumC5117 valueOf(String str) {
        return (EnumC5117) Enum.valueOf(EnumC5117.class, str);
    }

    public static EnumC5117[] values() {
        return (EnumC5117[]) f16965.clone();
    }
}

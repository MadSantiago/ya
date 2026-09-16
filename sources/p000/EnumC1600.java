package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥۣ٘ؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1600 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC1600[] f5371;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC1600 f5372;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1600 EF0;

    static {
        EnumC1600 enumC1600 = new EnumC1600("NOT_SET", 0);
        EnumC1600 enumC1601 = new EnumC1600("EVENT_OVERRIDE", 1);
        f5372 = enumC1601;
        f5371 = new EnumC1600[]{enumC1600, enumC1601};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC1600);
        sparseArray.put(5, enumC1601);
    }

    public static EnumC1600 valueOf(String str) {
        return (EnumC1600) Enum.valueOf(EnumC1600.class, str);
    }

    public static EnumC1600[] values() {
        return (EnumC1600[]) f5371.clone();
    }
}

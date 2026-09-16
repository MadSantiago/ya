package p000;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥّۢؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2635 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC2635[] f8751;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final HashMap f8752;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2635 f8753;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2635 EF0;

    static {
        EnumC2635 enumC2635 = new EnumC2635("X86_32", 0);
        EnumC2635 enumC2636 = new EnumC2635("X86_64", 1);
        EnumC2635 enumC2637 = new EnumC2635("ARM_UNKNOWN", 2);
        EnumC2635 enumC2638 = new EnumC2635("PPC", 3);
        EnumC2635 enumC2639 = new EnumC2635("PPC64", 4);
        EnumC2635 enumC26310 = new EnumC2635("ARMV6", 5);
        EnumC2635 enumC26311 = new EnumC2635("ARMV7", 6);
        EnumC2635 enumC26312 = new EnumC2635("UNKNOWN", 7);
        f8753 = enumC26312;
        EnumC2635 enumC26313 = new EnumC2635("ARMV7S", 8);
        EnumC2635 enumC26314 = new EnumC2635("ARM64", 9);
        f8751 = new EnumC2635[]{enumC2635, enumC2636, enumC2637, enumC2638, enumC2639, enumC26310, enumC26311, enumC26312, enumC26313, enumC26314};
        HashMap map = new HashMap(4);
        f8752 = map;
        map.put("armeabi-v7a", enumC26311);
        map.put("armeabi", enumC26310);
        map.put("arm64-v8a", enumC26314);
        map.put("x86", enumC2635);
    }

    public static EnumC2635 valueOf(String str) {
        return (EnumC2635) Enum.valueOf(EnumC2635.class, str);
    }

    public static EnumC2635[] values() {
        return (EnumC2635[]) f8751.clone();
    }
}

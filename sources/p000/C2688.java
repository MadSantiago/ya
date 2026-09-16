package p000;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥۤؖ۠ٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2688 extends AbstractC2758 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final Map f8928;

    /* JADX INFO: renamed from: ۥْ */
    public final EnumC2571 f8929;

    static {
        EnumMap enumMap = new EnumMap(EnumC2571.class);
        for (EnumC2571 enumC2571 : EnumC2571.values()) {
            C2688[] c2688Arr = new C2688[10];
            for (int i = 0; i < 10; i++) {
                c2688Arr[i] = new C2688(i, enumC2571, C0562.f2005);
            }
            enumMap.put(enumC2571, c2688Arr);
        }
        f8928 = Collections.unmodifiableMap(enumMap);
    }

    public C2688(int i, EnumC2571 enumC2571, C0562 c0562) {
        super(c0562, i);
        AbstractC3933.m7065(enumC2571, "format char");
        this.f8929 = enumC2571;
        if (c0562.m1263()) {
            return;
        }
        int i2 = enumC2571.f8588;
        i2 = c0562.m1261() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        c0562.m1264(sb);
        sb.append((char) i2);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٕ */
    public final void mo3563(C3043 c3043, Object obj) {
        c3043.m5646(obj, this.f8929, (C0562) this.f9135);
    }
}

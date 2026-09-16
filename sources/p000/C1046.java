package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ۥُْؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 extends AbstractC4650 {

    /* JADX INFO: renamed from: ۥُ */
    public final String f3700;

    /* JADX INFO: renamed from: ۥّ */
    public final Integer f3701;

    /* JADX INFO: renamed from: ۥۜ */
    public final C2432 f3702;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f3703;

    /* JADX INFO: renamed from: ۦِ */
    public final C2432 f3704;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2432 f3705;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f3706;

    public C1046(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f3703 = i3;
        this.f3700 = str;
        this.f3701 = num;
        this.f3706 = arrayList;
        this.f3702 = new C2432(new C0101(7, this));
        this.f3705 = new C2432(new C3034(this, dexKitBridge, i2));
        this.f3704 = new C2432(new C3034(dexKitBridge, this, i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1046) {
            return this.f3700.equals(((C1046) obj).f3700);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3700.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3703;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class ".concat(((C2572) this.f3702.getValue()).f8589));
        C1046 c1046 = (C1046) this.f3705.getValue();
        if (c1046 != null) {
            sb.append(" extends ");
            sb.append(((C2572) c1046.f3702.getValue()).f8589);
        }
        if (this.f3706.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0973.m2056((C3728) this.f3704.getValue(), ", ", null, null, new C3018(6), 30));
        }
        return sb.toString();
    }
}

package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ۦٍؘَؙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3570 extends AbstractC4650 {

    /* JADX INFO: renamed from: ۥُ */
    public final String f11821;

    /* JADX INFO: renamed from: ۥّ */
    public final C2432 f11822;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f11823;

    public C3570(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f11823 = i4;
        this.f11821 = str;
        this.f11822 = new C2432(new C0101(21, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3570) && ((C3570) obj).f11821.equals(this.f11821);
    }

    public final int hashCode() {
        return this.f11821.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f11823;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m6362().f19218);
        sb.append(" ");
        sb.append(m6362().f19217);
        sb.append(".");
        sb.append(m6362().f19216);
        sb.append("(");
        return AbstractC3761.m6621(sb, AbstractC0973.m2056(m6362().f19214, ", ", null, null, null, 62), ")");
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final C5836 m6362() {
        return (C5836) this.f11822.getValue();
    }
}

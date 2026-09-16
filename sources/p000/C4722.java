package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: ۦۣٝؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4722 extends C3315 {
    public C4722(C2639 c2639, WindowInsets windowInsets) {
        super(c2639, windowInsets);
    }

    @Override // p000.C1297, p000.C3470
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4722)) {
            return false;
        }
        C4722 c4722 = (C4722) obj;
        return Objects.equals(this.f4410, c4722.f4410) && Objects.equals(this.f4420, c4722.f4420) && C1297.m2728(this.f4413, c4722.f4413);
    }

    @Override // p000.C3470
    public int hashCode() {
        return this.f4410.hashCode();
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥۜ */
    public C1798 mo6259() {
        DisplayCutout displayCutout = this.f4410.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1798(displayCutout);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥۣ */
    public C2639 mo6260() {
        return C2639.m4953(this.f4410.consumeDisplayCutout(), null);
    }

    public C4722(C2639 c2639, C4722 c4722) {
        super(c2639, c4722);
    }
}

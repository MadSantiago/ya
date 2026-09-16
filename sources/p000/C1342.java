package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: ۥٍٕٔؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1342 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4708 f4627;

    public C1342(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f4627 = new C5231(nestedScrollView);
        } else {
            this.f4627 = new C4992(26);
        }
    }
}

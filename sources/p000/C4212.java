package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: ۦٕؒؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4212 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C4228 f13981;

    /* JADX INFO: renamed from: ۥۣ */
    public final TextView f13982;

    public C4212(TextView textView) {
        this.f13982 = textView;
        this.f13981 = new C4228(textView);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7432(boolean z) {
        ((AbstractC0993) this.f13981.f14025).mo2168(z);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7433(boolean z) {
        ((AbstractC0993) this.f13981.f14025).mo2167(z);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7434(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f13982.getContext().obtainStyledAttributes(attributeSet, AbstractC5618.f18527, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m7432(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

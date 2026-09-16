package p000;

import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: ۥۦٜؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2828 {

    /* JADX INFO: renamed from: ۥؗ */
    public final TextClassification f9443;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f9444;

    /* JADX INFO: renamed from: ۥۣ */
    public final CharSequence f9445;

    public C2828(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f9445 = charSequence;
        this.f9444 = j;
        this.f9443 = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2828)) {
            return false;
        }
        C2828 c2828 = (C2828) obj;
        return AbstractC3831.m6874(this.f9445, c2828.f9445) && C3346.m6110(this.f9444, c2828.f9444) && AbstractC3831.m6874(this.f9443, c2828.f9443);
    }

    public final int hashCode() {
        int iHashCode = this.f9445.hashCode() * 31;
        int i = C3346.f11195;
        return this.f9443.hashCode() + AbstractC3761.m6626(iHashCode, 31, this.f9444);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f9445) + ", selection=" + ((Object) C3346.m6111(this.f9444)) + ", textClassification=" + this.f9443 + ')';
    }
}

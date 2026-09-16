package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؘؚؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3470 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2639 f11515;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2639 f11516;

    static {
        AbstractC0734 c4090;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c4090 = new C1462();
        } else if (i >= 35) {
            c4090 = new C5386();
        } else if (i >= 34) {
            c4090 = new C1756();
        } else if (i >= 31) {
            c4090 = new C4277();
        } else if (i >= 30) {
            c4090 = new C2973();
        } else {
            c4090 = i >= 29 ? new C4090() : new C3399();
        }
        f11515 = c4090.mo1617().f8768.mo6260().f8768.mo6093().f8768.mo6091();
    }

    public C3470(C2639 c2639) {
        this.f11516 = c2639;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3470)) {
            return false;
        }
        C3470 c3470 = (C3470) obj;
        return mo2742() == c3470.mo2742() && mo6092() == c3470.mo6092() && Objects.equals(mo2754(), c3470.mo2754()) && Objects.equals(mo6094(), c3470.mo6094()) && Objects.equals(mo6259(), c3470.mo6259());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo2742()), Boolean.valueOf(mo6092()), mo2754(), mo6094(), mo6259());
    }

    /* JADX INFO: renamed from: ۥؗ */
    public C2639 mo6091() {
        return this.f11516;
    }

    /* JADX INFO: renamed from: ۥَ */
    public boolean mo6092() {
        return false;
    }

    /* JADX INFO: renamed from: ۥّ */
    public List<Rect> mo2739(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public C2639 mo2741(int i, int i2, int i3, int i4) {
        return f11515;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public boolean mo2742() {
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C2639 mo6093() {
        return this.f11516;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public C1798 mo6259() {
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C2639 mo6260() {
        return this.f11516;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public C5364 mo6094() {
        return C5364.f17692;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public C5364 mo3535() {
        return mo2754();
    }

    /* JADX INFO: renamed from: ۦِ */
    public C5364 mo2749(int i) {
        if ((i & 8) == 0) {
            return C5364.f17692;
        }
        C1078.m2272("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public boolean mo2751(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public C5364 mo2752(int i) {
        return C5364.f17692;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public C5364 mo3536() {
        return mo2754();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public List<Rect> mo2753(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public C5364 mo2754() {
        return C5364.f17692;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public C5364 mo3537() {
        return mo2754();
    }

    /* JADX INFO: renamed from: ۥْ */
    public void mo2740() {
    }

    /* JADX INFO: renamed from: ۥؓ */
    public void mo2736(int i) {
    }

    /* JADX INFO: renamed from: ۥؖ */
    public void mo3534(C5364 c5364) {
    }

    /* JADX INFO: renamed from: ۥً */
    public void mo2737(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: ۥُ */
    public void mo2738(C2639 c2639) {
    }

    /* JADX INFO: renamed from: ۥٙ */
    public void mo2743(C2639 c2639) {
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void mo2744(C5364[] c5364Arr) {
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void mo2745(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo2746(View view) {
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void mo2750(C5364 c5364) {
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void mo2755(C0171 c0171) {
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void mo2756(View view) {
    }
}

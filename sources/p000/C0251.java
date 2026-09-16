package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: ۥؒؓۘۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0251 implements InterfaceC4870 {

    /* JADX INFO: renamed from: ۥؗ */
    public View f925;

    /* JADX INFO: renamed from: ۥُ */
    public Drawable f926;

    /* JADX INFO: renamed from: ۥّ */
    public Drawable f927;

    /* JADX INFO: renamed from: ۥۗ */
    public int f928;

    /* JADX INFO: renamed from: ۥۜ */
    public CharSequence f929;

    /* JADX INFO: renamed from: ۥۣ */
    public Toolbar f930;

    /* JADX INFO: renamed from: ۦؑ */
    public Drawable f931;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f932;

    /* JADX INFO: renamed from: ۦٌ */
    public C4718 f933;

    /* JADX INFO: renamed from: ۦِ */
    public CharSequence f934;

    /* JADX INFO: renamed from: ۦٛ */
    public CharSequence f935;

    /* JADX INFO: renamed from: ۦۗ */
    public Window.Callback f936;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f937;

    /* JADX INFO: renamed from: ۦۚ */
    public int f938;

    /* JADX INFO: renamed from: ۦۨ */
    public Drawable f939;

    /* JADX INFO: renamed from: ۥؗ */
    public final void m527() {
        Drawable drawable;
        int i = this.f928;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f926) == null) {
            drawable = this.f931;
        }
        this.f930.setLogo(drawable);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m528() {
        if ((this.f928 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f934);
            Toolbar toolbar = this.f930;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f938);
            } else {
                toolbar.setNavigationContentDescription(this.f934);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m529(int i) {
        View view;
        Toolbar toolbar = this.f930;
        int i2 = this.f928 ^ i;
        this.f928 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m528();
                }
                if ((this.f928 & 4) != 0) {
                    Drawable drawable = this.f927;
                    if (drawable == null) {
                        drawable = this.f939;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m527();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f929);
                    toolbar.setSubtitle(this.f935);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f925) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }
}

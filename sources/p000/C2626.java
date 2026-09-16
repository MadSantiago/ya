package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۥٕۢؖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2626 extends AbstractC0054 {

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f8733;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4852 f8734;

    public C2626(Context context) {
        super(context);
        this.f8734 = AbstractC2774.m5183(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C2626.class.getName();
    }

    @Override // p000.AbstractC0054
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8733;
    }

    public final void setContent(InterfaceC5731 interfaceC5731) {
        this.f8733 = true;
        this.f8734.setValue(interfaceC5731);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m5671();
        }
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1384(int i, C5362 c5362) {
        c5362.m8979(420213850);
        int i2 = 2;
        int i3 = (c5362.m8977(this) ? 4 : 2) | i;
        if (c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
            InterfaceC5731 interfaceC5731 = (InterfaceC5731) this.f8734.getValue();
            if (interfaceC5731 == null) {
                c5362.m8957(-1238823553);
            } else {
                c5362.m8957(98585282);
                interfaceC5731.mo219(c5362, 0);
            }
            c5362.m9009(false);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0046(this, i, i2);
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

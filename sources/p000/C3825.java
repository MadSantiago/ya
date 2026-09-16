package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: ۦَٟؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3825 extends AbstractViewOnTouchListenerC5472 {

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ View f12681;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ int f12682 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3825(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f12681 = actionMenuItemView;
    }

    @Override // p000.AbstractViewOnTouchListenerC5472
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo5072() {
        InterfaceC0470 interfaceC0470Mo5073;
        int i = this.f12682;
        View view = this.f12681;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                InterfaceC1580 interfaceC1580 = actionMenuItemView.f6;
                return interfaceC1580 != null && interfaceC1580.mo6(actionMenuItemView.f12) && (interfaceC0470Mo5073 = mo5073()) != null && interfaceC0470Mo5073.mo1018();
            default:
                ((C2954) view).f9910.m8053();
                return true;
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC5472
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0470 mo5073() {
        C0911 c0911;
        int i = this.f12682;
        View view = this.f12681;
        switch (i) {
            case 0:
                AbstractC1492 abstractC1492 = ((ActionMenuItemView) view).f2;
                if (abstractC1492 == null || (c0911 = ((C2736) abstractC1492).f9061.f15564) == null) {
                    return null;
                }
                return c0911.m4343();
            default:
                C0911 c0912 = ((C2954) view).f9910.f15566;
                if (c0912 == null) {
                    return null;
                }
                return c0912.m4343();
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC5472
    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo6819() {
        switch (this.f12682) {
            case 1:
                C4718 c4718 = ((C2954) this.f12681).f9910;
                if (c4718.f15562 != null) {
                    return false;
                }
                c4718.m8052();
                return true;
            default:
                return super.mo6819();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3825(C2954 c2954, C2954 c2955) {
        super(c2955);
        this.f12681 = c2954;
    }
}

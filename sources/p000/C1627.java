package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: ۥٙؑٙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1627 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC0814 f5445;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4745 f5446;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ AbstractC2109 f5447;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ int f5448;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ View f5449;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Context f5450;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627(Context context, InterfaceC4745 interfaceC4745, C3102 c3102, InterfaceC0814 interfaceC0814, int i, View view) {
        super(0);
        this.f5450 = context;
        this.f5446 = interfaceC4745;
        this.f5447 = c3102;
        this.f5445 = interfaceC0814;
        this.f5448 = i;
        this.f5449 = view;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        return new C4855(this.f5450, this.f5446, this.f5447, this.f5445, this.f5448, (InterfaceC2043) this.f5449).getLayoutNode();
    }
}

package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: ۥَٚؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1700 extends Activity implements InterfaceC4507, InterfaceC0608 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C4170 f5665 = new C4170(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (AbstractC3608.m6433(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0186.m413(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (AbstractC3608.m6433(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC3857.f12886;
        AbstractC2298.m4348(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C4170 c4170 = this.f5665;
        c4170.m7368("setCurrentState");
        c4170.m7366(EnumC0458.f1653);
        super.onSaveInstanceState(bundle);
    }

    @Override // p000.InterfaceC0608
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo547(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}

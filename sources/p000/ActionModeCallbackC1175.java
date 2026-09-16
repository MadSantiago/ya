package p000;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: ۥّؖۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC1175 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2048 f4061;

    public ActionModeCallbackC1175(C2048 c2048) {
        this.f4061 = c2048;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f4061.m3992(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f4061.f6758.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C2793 c2793 = (C2793) this.f4061.f6756.mo449();
        rect.set(Math.round(c2793.f9343), Math.round(c2793.f9342), Math.round(c2793.f9341), Math.round(c2793.f9344));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f4061.m3992(menu);
    }
}

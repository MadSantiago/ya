package p000;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: ۦَۢؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5531 {
    /* JADX INFO: renamed from: ۥۣ */
    public static void m9207(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}

package p000;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: renamed from: ۦُ۟ؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5323 {
    /* JADX INFO: renamed from: ۥۣ */
    public static void m8928(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}

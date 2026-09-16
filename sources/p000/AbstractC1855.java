package p000;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: ۥّٜۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1855 {
    /* JADX INFO: renamed from: ۥؓ */
    public static /* bridge */ /* synthetic */ Class m3677() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static /* bridge */ /* synthetic */ Class m3678() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static /* bridge */ /* synthetic */ boolean m3683(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static /* bridge */ /* synthetic */ Class m3686() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static /* bridge */ /* synthetic */ boolean m3687(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static /* bridge */ /* synthetic */ Class m3691() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* bridge */ /* synthetic */ InsertGesture m3695(Object obj) {
        return (InsertGesture) obj;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static /* bridge */ /* synthetic */ Class m3696() {
        return DeleteRangeGesture.class;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static /* bridge */ /* synthetic */ Class m3697() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static /* bridge */ /* synthetic */ Class m3699() {
        return SelectGesture.class;
    }
}

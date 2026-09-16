package p000;

import android.adservices.measurement.MeasurementManager;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: ۥِؚِ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1129 {
    /* JADX INFO: renamed from: ۥؓ */
    public static /* bridge */ /* synthetic */ boolean m2357(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static /* bridge */ /* synthetic */ HandwritingGesture m2358(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: ۥً */
    public static /* bridge */ /* synthetic */ boolean m2360(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static /* bridge */ /* synthetic */ Class m2361() {
        return MeasurementManager.class;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static /* bridge */ /* synthetic */ SelectGesture m2364(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m2365(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static /* bridge */ /* synthetic */ boolean m2368(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static /* bridge */ /* synthetic */ boolean m2372(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static /* bridge */ /* synthetic */ MeasurementManager m2373(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* bridge */ /* synthetic */ DeleteGesture m2374(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m2375(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static /* bridge */ /* synthetic */ boolean m2379(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static /* bridge */ /* synthetic */ HandwritingGesture m2383(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m2385(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m2386(Object obj) {
        return (JoinOrSplitGesture) obj;
    }
}

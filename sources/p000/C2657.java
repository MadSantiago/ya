package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: ۥٌۤؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2657 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C5322 f8816;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2657(InputConnection inputConnection, C5322 c5322) {
        super(inputConnection, false);
        this.f8816 = c5322;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC2142 c5086;
        int i2 = 0;
        C3121 c3121 = inputContentInfo == null ? null : new C3121(i2, new C5086(25, inputContentInfo));
        C5396 c5396 = (C5396) this.f8816.f17566;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C5086) c3121.f10451).f16877).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C5086) c3121.f10451).f16877;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C5086) c3121.f10451).f16877;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c5086 = new C5086(clipData, 2);
        } else {
            C0384 c0384 = new C0384(i2);
            c0384.f1432 = clipData;
            c0384.f1429 = 2;
            c5086 = c0384;
        }
        c5086.mo844(inputContentInfo3.getLinkUri());
        c5086.setExtras(bundle2);
        if (AbstractC3608.m6431(c5396, c5086.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}

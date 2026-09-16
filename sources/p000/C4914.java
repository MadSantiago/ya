package p000;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۦۖؕؑۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4914 implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: ۦ۟ */
    public final AtomicInteger f16213 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f16214;

    public C4914(Object obj) {
        this.f16214 = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f16214).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f16214).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        this.f16213.get();
        ((SpanWatcher) this.f16214).onSpanAdded(spannable, obj, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014 A[PHI: r11
  0x0014: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:3:0x0009, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        this.f16213.get();
        if (Build.VERSION.SDK_INT >= 28) {
            i5 = i;
            i6 = i3;
        } else {
            if (i > i2) {
                i = 0;
            }
            if (i3 > i4) {
                i5 = i;
                i6 = 0;
            } else {
                i5 = i;
                i6 = i3;
            }
        }
        ((SpanWatcher) this.f16214).onSpanChanged(spannable, obj, i5, i2, i6, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        this.f16213.get();
        ((SpanWatcher) this.f16214).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f16214).onTextChanged(charSequence, i, i2, i3);
    }
}

package p000;

import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: ۥۣۗؒۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2102 extends AbstractC2395 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6921;

    /* JADX INFO: renamed from: ۥۗ */
    public final TextClassification f6922;

    public C2102(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f6922 = textClassification;
        this.f6921 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f7967);
        sb.append(", textClassification=");
        sb.append(this.f6922);
        sb.append(", index=");
        return AbstractC3761.m6638(sb, this.f6921, ')');
    }
}
